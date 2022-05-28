using AndroidApp.Model;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Text;
using Xamarin.Forms;

namespace AndroidApp.ViewModels
{
    //class implements Starters view features/data.
    //resources used to try implement MVVM model: 
    //https://whatis.techtarget.com/definition/Model-View-ViewModel
    //https://www.codeproject.com/Articles/1112919/MVVM-for-Beginners
    public class StartersViewModel : BaseViewModel
    {
        public ObservableCollection<Item> ItemsList { get; set; }

        //constructor makes new ObservableCollection and adds item to it for Starters Menu.
        //Links for images: https://gallery.yopriceville.com/Free-Clipart-Pictures/Fast-Food-PNG-Clipart/Sandwich_PNG_Clipart_Vector_Picture#.X6gSDmj7TIV
        //https://www.clipartmax.com/middle/m2H7H7N4N4H7H7m2_fast-food-rapid-food-fast-foodstuffs-french-fries-fries-icon-png/
        //https://www.clipartmax.com/middle/m2i8i8d3Z5H7b1K9_pot-of-food-emoji-vector-icon-emoji-food-png/
        public StartersViewModel()
        {
            ItemsList = new ObservableCollection<Item>
            {
                new Item { Name = "Sandwich", Image = "sandwich.png", Price = 5.99f },
                new Item { Name = "Fries", Image = "fries.png", Price = 1.59f },
                new Item { Name = "Soup", Image = "soup.png", Price = 4.89f }
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
