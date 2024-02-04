// Generated by view binder compiler. Do not edit!
package com.suretrustapp.suretrust.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.suretrustapp.suretrust.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAboutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ComposeView composeView;

  private FragmentAboutBinding(@NonNull ConstraintLayout rootView,
      @NonNull ComposeView composeView) {
    this.rootView = rootView;
    this.composeView = composeView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAboutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAboutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_about, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAboutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.compose_view;
      ComposeView composeView = ViewBindings.findChildViewById(rootView, id);
      if (composeView == null) {
        break missingId;
      }

      return new FragmentAboutBinding((ConstraintLayout) rootView, composeView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}