using AndroidApp.Model;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Text;
using Xamarin.Forms;

namespace AndroidApp.ViewModels
{
    public class BasketViewModel : BaseViewModel
    {
        public ObservableCollection<Item> ItemsList { get; set; }
        public BasketViewModel()
        {

            ItemsList = new ObservableCollection<Item>();
            ItemsList = App.items;
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
                var details = await Application.Current.MainPage.DisplayAlert(selectedItem.Name, "Would you like to remove " + selectedItem.Name + " from the basket?", "Yes", "No");
                if (details == true)
                {

                    App.items.Remove(selectedItem);
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
