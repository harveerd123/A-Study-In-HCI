using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace AndroidApp.Views
{
    [XamlCompilation(XamlCompilationOptions.Compile)]

    //class to add basket view functionality.
    public partial class Basket : ContentPage
    {
        public Basket()
        {
            InitializeComponent();
        }

        //method takes you back to main page when home icon clicked.
        public async void TapGestureRecognizer_Tapped(object sender, EventArgs e)
        {
            await Navigation.PushModalAsync(new MainPage());
        }

        //method for the button (Place Order) on basket view.
        private async void Button_Clicked(object sender, EventArgs e)
        {
            if (App.items.Count == 0)
            {
                await DisplayAlert("Order", "You have no items in your basket!", "Ok");
            }
            else
            {
                await DisplayAlert("Order", "Your order has been placed!", "Ok");
                App.items.Clear();
                await Navigation.PushModalAsync(new MainPage());
            }
        }
    }
}