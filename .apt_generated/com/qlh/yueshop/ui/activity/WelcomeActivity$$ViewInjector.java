// Generated code from Butter Knife. Do not modify!
package com.qlh.yueshop.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class WelcomeActivity$$ViewInjector<T extends com.qlh.yueshop.ui.activity.WelcomeActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034169, "field 'mIvLandingpage'");
    target.mIvLandingpage = finder.castView(view, 2131034169, "field 'mIvLandingpage'");
  }

  @Override public void reset(T target) {
    target.mIvLandingpage = null;
  }
}
