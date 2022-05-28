using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace DemoApp
{
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
        }

        public string ButtonText { get; set; }

        public string Button2Text { get; set; }

        public int number { get; set; }

        public void button1_Clicked(object sender, EventArgs e)
        {
            button1.Text = "You clicked the button!";
            ButtonText = button1.Text;
        }

        public void button2_Clicked(object sender, EventArgs e)
        {
            number++;   
            Button2Text = "You have " + number.ToString() + " items in your basket";
            DisplayAlert("Alert", Button2Text, "Ok");
        }

        protected async void button3_Clicked(object sender, EventArgs e)
        {
            Navigation.PushModalAsync(new TabbedPage1());
        }
    }
}
