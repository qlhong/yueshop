package com.qlh.yueshop.ui.fragment.home;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import butterknife.InjectView;

import com.android.volley.Response;
import com.qlh.yueshop.R;
import com.qlh.yueshop.adapter.ShelfCateListAdapter;
import com.qlh.yueshop.bean.Shelf;
import com.qlh.yueshop.bean.ShelfList;
import com.qlh.yueshop.config.UrlConfig;
import com.qlh.yueshop.listener.OnFragmentInteractionListener;
import com.qlh.yueshop.ui.fragment.BaseFragment;

public class ShelfFragment extends BaseFragment {
	@InjectView(R.id.search)
	EditText mEtSearch;

	@InjectView(R.id.shelfCatList)
	ListView mShelfCatList;

	@InjectView(R.id.shelfDetailList)
	GridView mShelfDetailList;

	private OnFragmentInteractionListener mListener;

	private ShelfCateListAdapter shelfCateListAdapter;

	// private ShelfCateListDetailAdapter shelfCateListDetailAdapter;

	@Override
	protected int getContentViewResId() {
		return R.layout.fragment_shelf;
	}
	
	public void loadData(String paramString, final Shelfs paramShelfs)
	{
		/* executeRequest(paramString, ShelfList.class, new Response.Listener()
		 {
			public void onResponse(ShelfList paramAnonymousShelfList) {
				switch (ShelfFragment.Shelfs[paramShelfs.ordinal()])
		        {
		        default:
		          return;
		        case 1:
		          List localList = (List)paramAnonymousShelfList.getBody();
		          if (localList.isEmpty())
		          {
		            ShelfFragment.this.mPbHelper.showNoData(new int[0]);
		            return;
		          }
		          ShelfFragment.this.mPbHelper.goneLoading();
		          ShelfFragment.this.shelfCateListAdapter.replaceAll(localList);
		          ShelfFragment.this.loadData(UrlConfig.SHOP_SHELF + ((Shelf)((List)paramAnonymousShelfList.getBody()).get(0)).getShelf_id(), ShelfFragment.Shelfs.detail);
		          return;
		        case 2:
		        }
		        ShelfFragment.access$402(ShelfFragment.this, new ShelfCateListDetailAdapter(ShelfFragment.this.context, (List)paramAnonymousShelfList.getBody()));
		        ShelfFragment.this.mShelfDetailList.setAdapter(ShelfFragment.this.shelfCateListDetailAdapter);
		      }
			@Override
			public void onResponse(Object arg0) {
				
			}
		 },errorListener());*/
	}

	public void onActivityCreated(Bundle paramBundle) {
		super.onActivityCreated(paramBundle);
	}

	public void onAttach(Activity paramActivity) {
		super.onAttach(paramActivity);
		try {
			this.mListener = ((OnFragmentInteractionListener) paramActivity);
			return;
		} catch (ClassCastException localClassCastException) {
		}
		throw new ClassCastException(paramActivity.toString()
				+ " must implement OnFragmentInteractionListener");
	}

	public void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
	}

	public void onDetach() {
		super.onDetach();
		this.mListener = null;
	}

	public void onViewCreated(View paramView, Bundle paramBundle) {
		super.onViewCreated(paramView, paramBundle);
		this.mEtSearch.setFocusable(false);
		this.shelfCateListAdapter = new ShelfCateListAdapter(this.context, null);
		this.mShelfCatList.setAdapter(this.shelfCateListAdapter);
		loadData(UrlConfig.SHOP_SHELF, Shelfs.category);
	}
	
	 private static enum Shelfs
	  {
		category, detail
	  }
	  /*  static
	    {
	      Shelfs[] arrayOfShelfs = new Shelfs[2];
	      arrayOfShelfs[0] = category;
	      arrayOfShelfs[1] = detail;
	    }
	  }*/

}
