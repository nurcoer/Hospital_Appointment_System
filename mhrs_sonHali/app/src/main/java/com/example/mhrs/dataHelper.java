package com.example.mhrs;

import com.example.mhrs.docClass;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class dataHelper {
    FirebaseDatabase database;
    DatabaseReference myRef;
    docClass Doc ;

     public dataHelper(){
        database = FirebaseDatabase.getInstance();
    }

    public void dataRead(String tablo,String child1){
        myRef = database.getReference(tablo);
        myRef.child(child1).addValueEventListener(new ValueEventListener(){
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //veri tabanından veri okunacak
            }
            @Override
            public void onCancelled(DatabaseError error) {
            }
        });
    }
    public void dataWrite(String tablo,String child1 ){
         //veri tabanına veri ekler
        myRef = database.getReference(tablo);
        myRef.setValue(child1);
    }
}
