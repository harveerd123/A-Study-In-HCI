using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Runtime.CompilerServices;
using System.Text;

namespace AndroidApp.ViewModels
{
    //BaseViewModel of MVVM model
    //resources used to try implement MVVM model: 
    //https://whatis.techtarget.com/definition/Model-View-ViewModel
    //https://www.codeproject.com/Articles/1112919/MVVM-for-Beginners
    public class BaseViewModel : INotifyPropertyChanged
    {
        public event PropertyChangedEventHandler PropertyChanged;

        public void OnPropertyChanged([CallerMemberName] string x = "")
        {
            PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(x));
        }
    }
}
