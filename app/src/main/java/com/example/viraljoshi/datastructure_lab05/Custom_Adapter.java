package com.example.viraljoshi.datastructure_lab05;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

//Can be use ArrayAdapter when data source is an array.
// By default, ArrayAdapter creates a view for each array item by calling toString() on each item and placing the contents in a TextView.
class Custom_Adapter extends ArrayAdapter<String>
{
    //Here are arguments for this constructor −
    //First argument this is the application context. Most of the case, keep it this.
    //Second argument will be layout defined in XML file and having TextView for each string in the array.
    //Final argument is an array of strings which will be populated in the text view.
    Custom_Adapter(@NonNull Context context, String[] em)
    {
        super(context,R.layout.custom_row, em);
    }

    @NonNull
    @Override
//The basic building block for user interface is a View object which is created from the View class
// It occupies a rectangular area on the screen and is responsible for drawing and event handling.
// View is the base class for widgets, which are used to create interactive UI components like buttons, text fields, etc.
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View customview=layoutInflater.inflate(R.layout.custom_row,parent,false);

        String singleItem=getItem(position);
        //Casting Textview from the xml file
        TextView textView=(TextView)customview.findViewById(R.id.textView1);
        //Casting Imageview from the xml file
        ImageView imageView=(ImageView)customview.findViewById(R.id.imageView2);
//Text from the List view is being called
        textView.setText(singleItem);
        //Sets an image with image switcher. The image is passed in the form of integer id
        imageView.setImageResource(R.drawable.tiesto1);
        return customview;
            }
}
