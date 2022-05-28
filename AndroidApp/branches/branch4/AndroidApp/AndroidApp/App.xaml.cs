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
