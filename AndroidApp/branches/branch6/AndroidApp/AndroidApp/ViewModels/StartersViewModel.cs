using AndroidApp.Model;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Text;
using Xamarin.Forms;

namespace AndroidApp.ViewModels
{
    public class StartersViewModel : BaseViewModel
    {
        public ObservableCollection<Item> ItemsList { get; set; }

        public StartersViewModel()
        {

            ItemsList = new ObservableCollection<Item>();
            ItemsList.Add(new Item { Name = "Sandwich", Image = "sandwich.png", price = 5.99f });
            ItemsList.Add(new Item { Name = "Fries", Image = "fries.png", price = 1.59f });
            ItemsList.Add(new Item { Name = "Soup", Image = "soup.png", price = 4.89f });
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
