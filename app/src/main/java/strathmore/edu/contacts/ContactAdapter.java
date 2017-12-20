package strathmore.edu.contacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> contacts;

    public ContactAdapter(Context context, ArrayList<String> contacts) {
        this.context = context;
        this.contacts = contacts;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int i) {
        return contacts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = LayoutInflater.from(context).inflate(R.layout.contact_layout, viewGroup, false);
        TextView contact =  (TextView) v.findViewById(R.id.contact);

        String string = contacts.get(i);
        contact.setText(string);

        return v;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

}
