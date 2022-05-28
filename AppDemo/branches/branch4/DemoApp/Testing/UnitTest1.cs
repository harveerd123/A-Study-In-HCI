using NUnit.Framework;
using System;

namespace Testing
{
    public class Tests
    {
        [SetUp]
        public void Setup()
        {
            Xamarin.Forms.Mocks.MockForms.Init();
        }

        [Test]
        public void Test1()
        {
            DemoApp.MainPage demo = new DemoApp.MainPage();
            demo.button1_Clicked(new object(), new EventArgs());
            Assert.AreEqual("You clicked the button!", demo.ButtonText);
        }

        [Test]
        
        public void Test2()
        {
            DemoApp.MainPage demo2 = new DemoApp.MainPage();
            demo2.button2_Clicked(new object(), new EventArgs());
            Assert.AreEqual("You have 1 items in your basket", demo2.Button2Text);
        }

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