using System;
using System.Collections.Generic;
using System.Text;

namespace AndroidApp.Model
{
    //class for Item and its contents.
    //resources used to try implement MVVM model: 
    //https://whatis.techtarget.com/definition/Model-View-ViewModel
    //https://www.codeproject.com/Articles/1112919/MVVM-for-Beginners
    public class Item
    {
        public string Name { get; set; }
        public string Image { get; set; }
        public float Price { get; set; }
    }
}
