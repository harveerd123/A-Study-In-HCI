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
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
        }

        private async void ImageButton_Clicked(object sender, EventArgs e)
        {
            await Navigation.PushModalAsync(new Starters());
        }

        private async void ImageButton_Clicked_1(object sender, EventArgs e)
        {
            await Navigation.PushModalAsync(new Mains());
        }

        private async void ImageButton_Clicked_2(object sender, EventArgs e)
        {
            await Navigation.PushModalAsync(new Drinks());
        }

        public async void TapGestureRecognizer_Tapped(object sender, EventArgs e)
        {

            await Navigation.PushModalAsync(new Basket());

        }
    }
}
