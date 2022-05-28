using AndroidApp.Model;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Text;
using Xamarin.Forms;

namespace AndroidApp.ViewModels
{
    //class implements Drinks view features/data.
    //resources used to try implement MVVM model: 
    //https://whatis.techtarget.com/definition/Model-View-ViewModel
    //https://www.codeproject.com/Articles/1112919/MVVM-for-Beginners
    public class DrinksViewModel: BaseViewModel
    {
        public ObservableCollection<Item> ItemsList { get; set; }

        //constructor makes new ObservableCollection and adds Items for Drinks Menu.
        //Links for images: http://www.pngall.com/beverage-png/download/44878
        //https://www.clipartmax.com/middle/m2i8K9H7K9Z5m2d3_coffee-cup-clipart-vector-clip-art-online-royalty-coffee/
        //https://www.clipartmax.com/middle/m2i8N4m2i8m2N4m2_glass-of-water-icons-glass-of-water-icon/
        public DrinksViewModel()
        {
            ItemsList = new ObservableCollection<Item>
            {
                new Item { Name = "Beverage", Image = "Beverage.png", Price = 4.99f },
                new Item { Name = "Water", Image = "water.png", Price = 0.99f },
                new Item { Name = "Coffee", Image = "coffee.png", Price = 2.49f }
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
