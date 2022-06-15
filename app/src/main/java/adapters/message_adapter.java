package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chat_android.R;

import java.util.Date;
import java.util.List;

import viewmodels.message;

public class message_adapter extends RecyclerView.Adapter<message_adapter.messageViewHolder> {
    private final LayoutInflater inflater;
    private List<message> messages;
    public message_adapter(Context context) {
        inflater = LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public messageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view
        if(messages.get(viewType).isSent() == true) {
            view = inflater.inflate(R.layout.messagesent_layout,parent,false);
        }
        else {
            view = inflater.inflate(R.layout.messagerecived_layout,parent,false);
        }
        return new messageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull messageViewHolder holder, int position) {
        if(messages != null) {
            final message current = messages.get(position);
            holder.content.setText(current.getContent());
            holder.time.setText(current.getCreated().toString());
        }
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class messageViewHolder extends RecyclerView.ViewHolder {
        private TextView content;
        private TextView time;
        public messageViewHolder(@NonNull View itemView) {
            super(itemView);
            content = itemView.findViewById(R.id.messageContent);
            time = itemView.findViewById(R.id.time_message);

        }
    }
    public void setMessages(List<message> meslist) {
        messages = meslist;
        notifyDataSetChanged();
    }
}
