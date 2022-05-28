using AndroidApp.Model;
using AndroidApp.Views;
using System;
using System.Collections.ObjectModel;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace AndroidApp
{
    public partial class App : Application
    {
        public static ObservableCollection<Item> items;

        //method loads MainPage as first window and then makes ObservableCollection which is 
        //accessible everywhere so I can implement a basket view (items added to basket).
        public App()
        {
            InitializeComponent();

            MainPage = new MainPage();
            items = new ObservableCollection<Item>();
        }

        protected override void OnStart()
        {
        }

        protected override void OnSleep()
        {
        }

        protected override void OnResume()
        {
        }
    }
}
