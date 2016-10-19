package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Workspace on 10/17/2016.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    //Creating color variable to store color as per activity for example family has red color
    private int colorState;


    public WordAdapter(Context context, ArrayList<Word> arrayList,int color) {
        super(context, 0,arrayList);
        colorState=color;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {





        //Check listview is created or not
        View listView=convertView;
        if(listView==null){
            listView= LayoutInflater.from(getContext()).inflate(R.layout.viewlist,null);

        }

        //Declaring listview to set the color
        View textContainer=listView.findViewById(R.id.text_container);
        //Creating variable to store the color
        int color= ContextCompat.getColor(getContext(),colorState);
        //Setting the color to the textContainer
        textContainer.setBackgroundColor(color);
        //Get the object located at the particular position
        Word word=getItem(position);

        //Find the text view in miwork application having id textview to set miwork translation
        TextView miworkTranslation=(TextView)listView.findViewById(R.id.textView);
        //Gettting the miwork translation from the word object and setting it to miworkTranslation
        miworkTranslation.setText(word.getMiwordTranslation());

        //Finding the texview in viewlist xml file having id textview1 to set default translation
        TextView defaultTranslation=(TextView)listView.findViewById(R.id.textView2);
        //Getting the default translation from the word object and setting it to defaultTranslation textView
        defaultTranslation.setText(word.getDefaultTranslation());

        ImageView imageView=(ImageView)listView.findViewById(R.id.image);

        //Using condition whether it has image or not
        if(word.hasImage()){
            imageView.setImageResource(word.getMyImageID());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }










        return listView;
    }
}
