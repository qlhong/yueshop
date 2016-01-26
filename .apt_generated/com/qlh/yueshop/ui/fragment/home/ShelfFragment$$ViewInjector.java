// Generated code from Butter Knife. Do not modify!
package com.qlh.yueshop.ui.fragment.home;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class ShelfFragment$$ViewInjector<T extends com.qlh.yueshop.ui.fragment.home.ShelfFragment> extends com.qlh.yueshop.ui.fragment.BaseFragment$$ViewInjector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    super.inject(finder, target, source);

    View view;
    view = finder.findRequiredView(source, 2131034162, "field 'mShelfDetailList'");
    target.mShelfDetailList = finder.castView(view, 2131034162, "field 'mShelfDetailList'");
    view = finder.findRequiredView(source, 2131034167, "field 'mEtSearch'");
    target.mEtSearch = finder.castView(view, 2131034167, "field 'mEtSearch'");
    view = finder.findRequiredView(source, 2131034161, "field 'mShelfCatList'");
    target.mShelfCatList = finder.castView(view, 2131034161, "field 'mShelfCatList'");
  }

  @Override public void reset(T target) {
    super.reset(target);

    target.mShelfDetailList = null;
    target.mEtSearch = null;
    target.mShelfCatList = null;
  }
}
