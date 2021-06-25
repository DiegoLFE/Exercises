package com.example.digitalhouse.persondatabase.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.digitalhouse.persondatabase.R;
import com.example.digitalhouse.persondatabase.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 12/06/17.
 */

public class AdapterPersonas extends RecyclerView.Adapter{

    private Context context;
    private List<Person> personList;

    public AdapterPersonas(Context context) {
        this.context = context;
        personList = new ArrayList<>();
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.detalle_celda, parent, false);
        PersonsViewHolder personsViewHolder = new PersonsViewHolder(view);
        return personsViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        PersonsViewHolder personsViewHolder = (PersonsViewHolder) holder;
        personsViewHolder.bindPerson(personList.get(position));
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public class PersonsViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewPersonName;
        private TextView textViewPersonLastTweet;

        public PersonsViewHolder(View itemView) {
            super(itemView);
            textViewPersonLastTweet = (TextView) itemView.findViewById(R.id.personLastTweet);
            textViewPersonName = (TextView) itemView.findViewById(R.id.personName);
        }

        public void bindPerson(Person person){
            textViewPersonName.setText(person.getName());
            textViewPersonLastTweet.setText(person.getLastTweet());
        }
    }
}
