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

    //class to add functionality for Starters page.
    public partial class Starters : ContentPage
    {
        public Starters()
        {
            InitializeComponent();
        }

        //method takes you back to main page if you click on home icon.
        public async void TapGestureRecognizer_Tapped(object sender, EventArgs e)
        {
            await Navigation.PushModalAsync(new MainPage());
        }
    }
}