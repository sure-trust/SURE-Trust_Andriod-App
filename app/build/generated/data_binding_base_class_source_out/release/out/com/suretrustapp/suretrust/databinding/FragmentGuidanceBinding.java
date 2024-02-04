// Generated by view binder compiler. Do not edit!
package com.suretrustapp.suretrust.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.suretrustapp.suretrust.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentGuidanceBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final LinearLayoutCompat container1;

  @NonNull
  public final LinearLayoutCompat container2;

  @NonNull
  public final LinearLayoutCompat content1;

  @NonNull
  public final LinearLayoutCompat content2;

  @NonNull
  public final AppCompatTextView descTv;

  @NonNull
  public final AppCompatTextView nameTv;

  @NonNull
  public final AppCompatTextView section1Title;

  @NonNull
  public final View sectionLine1;

  @NonNull
  public final View sectionLine2;

  @NonNull
  public final AppCompatTextView title2;

  private FragmentGuidanceBinding(@NonNull ScrollView rootView,
      @NonNull LinearLayoutCompat container1, @NonNull LinearLayoutCompat container2,
      @NonNull LinearLayoutCompat content1, @NonNull LinearLayoutCompat content2,
      @NonNull AppCompatTextView descTv, @NonNull AppCompatTextView nameTv,
      @NonNull AppCompatTextView section1Title, @NonNull View sectionLine1,
      @NonNull View sectionLine2, @NonNull AppCompatTextView title2) {
    this.rootView = rootView;
    this.container1 = container1;
    this.container2 = container2;
    this.content1 = content1;
    this.content2 = content2;
    this.descTv = descTv;
    this.nameTv = nameTv;
    this.section1Title = section1Title;
    this.sectionLine1 = sectionLine1;
    this.sectionLine2 = sectionLine2;
    this.title2 = title2;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentGuidanceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentGuidanceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_guidance, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentGuidanceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.container_1;
      LinearLayoutCompat container1 = ViewBindings.findChildViewById(rootView, id);
      if (container1 == null) {
        break missingId;
      }

      id = R.id.container_2;
      LinearLayoutCompat container2 = ViewBindings.findChildViewById(rootView, id);
      if (container2 == null) {
        break missingId;
      }

      id = R.id.content_1;
      LinearLayoutCompat content1 = ViewBindings.findChildViewById(rootView, id);
      if (content1 == null) {
        break missingId;
      }

      id = R.id.content_2;
      LinearLayoutCompat content2 = ViewBindings.findChildViewById(rootView, id);
      if (content2 == null) {
        break missingId;
      }

      id = R.id.desc_tv;
      AppCompatTextView descTv = ViewBindings.findChildViewById(rootView, id);
      if (descTv == null) {
        break missingId;
      }

      id = R.id.name_tv;
      AppCompatTextView nameTv = ViewBindings.findChildViewById(rootView, id);
      if (nameTv == null) {
        break missingId;
      }

      id = R.id.section_1_title;
      AppCompatTextView section1Title = ViewBindings.findChildViewById(rootView, id);
      if (section1Title == null) {
        break missingId;
      }

      id = R.id.section_line_1;
      View sectionLine1 = ViewBindings.findChildViewById(rootView, id);
      if (sectionLine1 == null) {
        break missingId;
      }

      id = R.id.section_line_2;
      View sectionLine2 = ViewBindings.findChildViewById(rootView, id);
      if (sectionLine2 == null) {
        break missingId;
      }

      id = R.id.title_2;
      AppCompatTextView title2 = ViewBindings.findChildViewById(rootView, id);
      if (title2 == null) {
        break missingId;
      }

      return new FragmentGuidanceBinding((ScrollView) rootView, container1, container2, content1,
          content2, descTv, nameTv, section1Title, sectionLine1, sectionLine2, title2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
