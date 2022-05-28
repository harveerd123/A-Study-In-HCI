using NUnit.Framework;
using System;

namespace Testing
{
    //NUnit testing done from this class.
    //Idea on how to carry out tests provided by youtube video
    //Link: https://www.youtube.com/watch?v=_GsWot-Ndk4
    public class Tests
    {
        //method initalises forms on each platform.
        //add-on provided by Jonathan Peppers.
        //Link: https://github.com/jonathanpeppers/Xamarin.Forms.Mocks
        [SetUp]
        public void Setup()
        {
            Xamarin.Forms.Mocks.MockForms.Init();
        }

        //test to check if button click works and correct text displayed upon clicking.
        [Test]
        public void Test1()
        {
            DemoApp.MainPage demo = new DemoApp.MainPage();
            demo.button1_Clicked(new object(), new EventArgs());
            Assert.AreEqual("You clicked the button!", demo.ButtonText);
        }

        //test to check if button click works and correct text displayed upon clicking.
        [Test]
        
        public void Test2()
        {
            DemoApp.MainPage demo2 = new DemoApp.MainPage();
            demo2.button2_Clicked(new object(), new EventArgs());
            Assert.AreEqual("You have 1 items in your basket", demo2.Button2Text);
        }

        //test to check correct maths is being done when multiple clicks done on button.
        [Test]
        public void Test3()
        {
            DemoApp.MainPage demo3 = new DemoApp.MainPage();
            demo3.button2_Clicked(new object(), new EventArgs());
            demo3.button2_Clicked(new object(), new EventArgs());
            Assert.AreEqual("You have 2 items in your basket", demo3.Button2Text);
        }
    }
}