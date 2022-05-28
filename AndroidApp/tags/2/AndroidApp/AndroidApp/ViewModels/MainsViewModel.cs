using AndroidApp.Model;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Text;
using Xamarin.Forms;

namespace AndroidApp.ViewModels
{
    //class implements Mains view features/data.
    //resources used to try implement MVVM model: 
    //https://whatis.techtarget.com/definition/Model-View-ViewModel
    //https://www.codeproject.com/Articles/1112919/MVVM-for-Beginners
    public class MainsViewModel: BaseViewModel
    {
        public ObservableCollection<Item> ItemsList { get; set; }

        //constructor makes new ObservableCollection and adds item to it for Mains Menu.
        //Link for image: https://www.clipartmax.com/middle/m2i8H7G6H7G6N4d3_nice-pizza-slice-clip-art-free-free-clip-art-food-junk-pizza/
        public MainsViewModel()
        {
            ItemsList = new ObservableCollection<Item>
            {
                new Item { Name = "Pizza", Image = "pizza.png", Price = 12.49f }
            };
        }

        public Item selectedItem;

        //method shows pop up window when item selected.
        //forums helped me come up with this method
        //Links: https://forums.xamarin.com/discussion/60937/how-to-bind-a-command-to-listview-itemtapped
        //https://stackoverflow.com/questions/10697513/access-item-in-observable-collection-on-item-selected
        public Item SelectedItem
        {
            get { return selectedItem; }
            set
            {
                selectedItem = value;
                OnPropertyChanged();
                DisplayWindow();
            }
        }

        //method for pop up window to add item to basket.
        public async void DisplayWindow()
        {
            if (selectedItem != null)
            {
                var details = await Application.Current.MainPage.DisplayAlert(selectedItem.Name, "Would you like to add " + selectedItem.Name + " to your basket?", "Yes", "No");
                if (details == true)
                {
                    App.items.Add(selectedItem);
                    SelectedItem = null;
                }
                else
                {
                    SelectedItem = null;
                }
            }
        }
    }
}
