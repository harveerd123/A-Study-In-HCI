using AndroidApp.Model;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Text;
using Xamarin.Forms;

namespace AndroidApp.ViewModels
{
    public class DrinksViewModel: BaseViewModel
    {
        public ObservableCollection<Item> ItemsList { get; set; }

        public DrinksViewModel()
        {

            ItemsList = new ObservableCollection<Item>();
            ItemsList.Add(new Item { Name = "Beverage", Image = "Beverage.png", price = 4.99f });
            ItemsList.Add(new Item { Name = "Water", Image = "water.png", price = 0.99f });
            ItemsList.Add(new Item { Name = "Coffee", Image = "coffee.png", price = 2.49f });
        }

        public Item selectedItem;
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
