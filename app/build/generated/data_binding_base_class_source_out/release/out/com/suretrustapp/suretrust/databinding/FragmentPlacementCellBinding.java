// Generated by view binder compiler. Do not edit!
package com.suretrustapp.suretrust.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.suretrustapp.suretrust.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPlacementCellBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ComposeView composeView;

  @NonNull
  public final AppCompatTextView headingTv;

  @NonNull
  public final AppCompatTextView sectionTitleTv;

  @NonNull
  public final View sectionTitleUnderline;

  @NonNull
  public final AppCompatTextView subHeadingTv;

  @NonNull
  public final AppCompatTextView subSubHeadingTv;

  private FragmentPlacementCellBinding(@NonNull ScrollView rootView,
      @NonNull ComposeView composeView, @NonNull AppCompatTextView headingTv,
      @NonNull AppCompatTextView sectionTitleTv, @NonNull View sectionTitleUnderline,
      @NonNull AppCompatTextView subHeadingTv, @NonNull AppCompatTextView subSubHeadingTv) {
    this.rootView = rootView;
    this.composeView = composeView;
    this.headingTv = headingTv;
    this.sectionTitleTv = sectionTitleTv;
    this.sectionTitleUnderline = sectionTitleUnderline;
    this.subHeadingTv = subHeadingTv;
    this.subSubHeadingTv = subSubHeadingTv;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPlacementCellBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPlacementCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_placement_cell, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPlacementCellBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.compose_view;
      ComposeView composeView = ViewBindings.findChildViewById(rootView, id);
      if (composeView == null) {
        break missingId;
      }

      id = R.id.heading_tv;
      AppCompatTextView headingTv = ViewBindings.findChildViewById(rootView, id);
      if (headingTv == null) {
        break missingId;
      }

      id = R.id.section_title_tv;
      AppCompatTextView sectionTitleTv = ViewBindings.findChildViewById(rootView, id);
      if (sectionTitleTv == null) {
        break missingId;
      }

      id = R.id.section_title_underline;
      View sectionTitleUnderline = ViewBindings.findChildViewById(rootView, id);
      if (sectionTitleUnderline == null) {
        break missingId;
      }

      id = R.id.sub_heading_tv;
      AppCompatTextView subHeadingTv = ViewBindings.findChildViewById(rootView, id);
      if (subHeadingTv == null) {
        break missingId;
      }

      id = R.id.sub_sub_heading_tv;
      AppCompatTextView subSubHeadingTv = ViewBindings.findChildViewById(rootView, id);
      if (subSubHeadingTv == null) {
        break missingId;
      }

      return new FragmentPlacementCellBinding((ScrollView) rootView, composeView, headingTv,
          sectionTitleTv, sectionTitleUnderline, subHeadingTv, subSubHeadingTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
