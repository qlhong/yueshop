package com.qlh.yueshop.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;

import com.qlh.yueshop.R;
import com.qlh.yueshop.bean.Shelf;

public class ShelfCateListAdapter extends SimpleBaseAdapter {

	@InjectView(R.id.cate_name)
	TextView mCateName;
	private int mSelectedPosition;

	public ShelfCateListAdapter(Context paramContext, List<Shelf> paramList) {
		super(paramContext, paramList);
	}

	@Override
	public int getItemResource() {
		return R.layout.fragment_shelf_cate_list_item;
	}

	@Override
	public View getItemView(int paramInt, View paramView,
			com.qlh.yueshop.adapter.SimpleBaseAdapter.ViewHolder holder) {
		ButterKnife.inject(this, paramView);
		Shelf localShelf = (Shelf) this.data.get(paramInt);
		this.mCateName.setText(localShelf.getShelf_name());
		this.mCateName.setGravity(17);
		this.mCateName.setWidth(this.context.getResources()
				.getDrawable(R.drawable.list_selector).getMinimumWidth());
		if (paramInt == this.mSelectedPosition)
	    {
	      this.mCateName.setBackgroundResource(R.drawable.brackground_whitearrow);
	      this.mCateName.setSelected(true);
	      return paramView;
	    }
	    this.mCateName.setBackgroundColor(-921103);
	    this.mCateName.setSelected(false);
	    return paramView;
	}

	public void setSelectedPosition(int paramInt) {
		this.mSelectedPosition = paramInt;
	}

}
