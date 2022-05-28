using AndroidApp.Views;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace AndroidApp
{
    //class to add main page functionality.
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
        }

        //method to take you to Starters page if you click on Starters image.
        private async void ImageButton_Clicked(object sender, EventArgs e)
        {
            await Navigation.PushModalAsync(new Starters());
        }

        //method to take you to Mains page if you click on Mains image.
        private async void ImageButton_Clicked_1(object sender, EventArgs e)
        {
            await Navigation.PushModalAsync(new Mains());
        }

        //method to take you to Drinks page if you click on Drinks image.
        private async void ImageButton_Clicked_2(object sender, EventArgs e)
        {
            await Navigation.PushModalAsync(new Drinks());
        }

        //method to take you to basket view if you click basket icon.
        public async void TapGestureRecognizer_Tapped(object sender, EventArgs e)
        {
            await Navigation.PushModalAsync(new Basket());
        }
    }
}
