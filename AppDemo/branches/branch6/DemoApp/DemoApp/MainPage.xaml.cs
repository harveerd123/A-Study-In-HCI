using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace DemoApp
{
    //MainPage functionality provided from this class.
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
        }

        public string ButtonText { get; set; }

        public string Button2Text { get; set; }

        public int number { get; set; }

        //method shows text when button clicked.
        public void button1_Clicked(object sender, EventArgs e)
        {
            button1.Text = "You clicked the button!";
            ButtonText = button1.Text;
        }

        //method shows pop up message when button clicked.
        public void button2_Clicked(object sender, EventArgs e)
        {
            number++;   
            Button2Text = "You have " + number.ToString() + " items in your basket";
            DisplayAlert("Alert", Button2Text, "Ok");
        }

        //method loads TabbedPage when button clicked.
        protected async void Button3_Clicked(object sender, EventArgs e)
        {
            await Navigation.PushModalAsync(new TabbedPage1());
        }
    }
}
