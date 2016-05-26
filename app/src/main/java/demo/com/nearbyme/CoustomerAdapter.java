package demo.com.nearbyme;

import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import demo.com.nearbyme.entities.CustomerInfoBean;

public class CoustomerAdapter extends RecyclerView.Adapter<CoustomerAdapter.MyViewHolder> {

    ArrayList<CustomerInfoBean>   mCustomerBeanList= new ArrayList<>();

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvUserID, tvUserName, tvDistance;

        public MyViewHolder(View view) {
            super(view);
            tvUserID = (TextView) view.findViewById(R.id.tv_userID);
            tvUserName = (TextView) view.findViewById(R.id.tv_UserName);
            tvDistance = (TextView) view.findViewById(R.id.tvDistance);
        }
    }

    public void addData(ArrayList<CustomerInfoBean> _customerBeanLis) {
       // mCustomerBeanList.clear();
        mCustomerBeanList = _customerBeanLis;
    }

    public CoustomerAdapter(ArrayList<CustomerInfoBean> _customerBeanLis) {
        mCustomerBeanList = _customerBeanLis;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user_list_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        CustomerInfoBean _CustomerInfoBean = mCustomerBeanList.get(position);
        holder.tvUserID.setText("User ID: "+_CustomerInfoBean.getUser_id());
        holder.tvUserName.setText("User name: "+_CustomerInfoBean.getCustomer_name());
        holder.tvDistance.setText("Distance: "+_CustomerInfoBean.getDistanceInKm() + " KM.");
    }

    @Override
    public int getItemCount() {
        return mCustomerBeanList.size();
    }
}