// Generated code from Butter Knife. Do not modify!
package com.qlh.yueshop.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class ShelfCateListAdapter$$ViewInjector<T extends com.qlh.yueshop.adapter.ShelfCateListAdapter> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034163, "field 'mCateName'");
    target.mCateName = finder.castView(view, 2131034163, "field 'mCateName'");
  }

  @Override public void reset(T target) {
    target.mCateName = null;
  }
}
