using AndroidApp.Model;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Text;
using Xamarin.Forms;

namespace AndroidApp.ViewModels
{
    //class implements Basket view.
    public class BasketViewModel : BaseViewModel
    {
        public ObservableCollection<Item> ItemsList { get; set; }

        //constructor makes new ObservableCollection and gets items in the ObservableCollection in App
        //and adds them to this new one.
        public BasketViewModel()
        {
            ItemsList = new ObservableCollection<Item>();
            ItemsList = App.items;
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

        //method for pop up window to delete item from basket.
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
