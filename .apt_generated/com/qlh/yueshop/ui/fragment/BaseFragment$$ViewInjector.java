// Generated code from Butter Knife. Do not modify!
package com.qlh.yueshop.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class BaseFragment$$ViewInjector<T extends com.qlh.yueshop.ui.fragment.BaseFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findOptionalView(source, 2131558634, null);
    target.mPbHelper = finder.castView(view, 2131558634, "field 'mPbHelper'");
  }

  @Override public void reset(T target) {
    target.mPbHelper = null;
  }
}
