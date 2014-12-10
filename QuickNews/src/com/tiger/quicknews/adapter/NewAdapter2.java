
package com.tiger.quicknews.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.tiger.quicknews.bean.NewModle;
import com.tiger.quicknews.utils.LogUtils2;
import com.tiger.quicknews.view.NewItemView;
import com.tiger.quicknews.view.NewItemView_;

public class NewAdapter2 extends BaseAdapter {
    public List<NewModle> lists = new ArrayList<NewModle>();

    private String currentItem;
    private  Context mContext;
    private static NewAdapter2 mNewAdapter2;

    public NewAdapter2 (Context context){
    	
    	if(context != null){
    		mContext = context;
    	}
    	
    	if(lists == null){
    		 lists = new ArrayList<NewModle>();
    	}else {
			lists = getLists();
		}
    	
    	
    }


	public static NewAdapter2 instanceAdapter(Context context,int index){
		
		if(mNewAdapter2 == null){
			mNewAdapter2 = new NewAdapter2(context);
		}
		return mNewAdapter2;
		
	}
    
    
    public void appendList(List<NewModle> list) {
    	LogUtils2.d("list---"+list.size());
        if (!lists.contains(list.get(0)) && list != null && list.size() > 0) {
            lists.addAll(list);
            LogUtils2.e("*********lists.size==***== " +lists.size());
        }
        notifyDataSetChanged();
    }

   

    public void clear() {
        lists.clear();
        notifyDataSetChanged();
    }

    public void currentItem(String item) {
        this.currentItem = item;
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        NewItemView newItemView;

        if (convertView == null) {
            newItemView = NewItemView_.build(mContext);
        } else {
            newItemView = (NewItemView) convertView;
        }

        NewModle newModle = lists.get(position);
        if (newModle.getImagesModle() == null) {
            newItemView.setTexts(newModle.getTitle(), newModle.getDigest(),
                    newModle.getImgsrc(), currentItem);
        } else {
            newItemView.setImages(newModle);
        }

        return newItemView;
    }

    
	public List<NewModle> getLists() {
		return lists;
	}

	public void setLists(List<NewModle> lists) {
		this.lists = lists;
	}

}
