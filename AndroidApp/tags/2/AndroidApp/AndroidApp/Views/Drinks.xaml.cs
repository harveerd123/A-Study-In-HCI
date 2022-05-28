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

    //class to add drinks view functionality.
    public partial class Drinks : ContentPage
    {
        public Drinks()
        {
            InitializeComponent();
        }

        //method takes you back to main page when home icon clicked.
        public async void TapGestureRecognizer_Tapped(object sender, EventArgs e)
        {
            await Navigation.PushModalAsync(new MainPage());
        }
    }
}