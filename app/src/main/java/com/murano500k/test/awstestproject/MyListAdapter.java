package com.murano500k.test.awstestproject;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.murano500k.test.awstestproject.model.Building;
import com.squareup.picasso.Picasso;

import java.util.List;

import static com.murano500k.test.awstestproject.RestHelper.BASE_URL;

/**
 * Created by artem on 9/28/16.
 */

public class MyListAdapter  extends RecyclerView.Adapter<MyListAdapter.MyViewHolder> {
	private List<Building> buildingList;



	@Override
	public long getItemId(int position) {
		return buildingList.get(position).getId();
	}

	public MyListAdapter(List<Building> moviesList) {
		this.buildingList = moviesList;
	}

	@Override
	public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View itemView = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.list_item, parent, false);

		return new MyViewHolder(itemView);
	}

	@Override
	public void onBindViewHolder(MyViewHolder holder, int position) {
		Building building = buildingList.get(position);
		holder.title.setText(building.getTitle());
		String imgUrl = BASE_URL+ "/" + building.getImage();
		Log.w("Picasso url", imgUrl);
		Picasso.with(holder.view.getContext()).load(Uri.parse(imgUrl)).into(holder.image);
	}

	@Override
	public int getItemCount() {
		return buildingList.size();
	}
	public class MyViewHolder extends RecyclerView.ViewHolder {
		public TextView title;
		public ImageView image;
		public View view;
		public MyViewHolder(View view) {
			super(view);
			this.view=view;
			title = (TextView) view.findViewById(R.id.title);
			image = (ImageView) view.findViewById(R.id.image);
		}
	}
}
