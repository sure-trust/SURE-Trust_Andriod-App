// Generated by view binder compiler. Do not edit!
package com.suretrustapp.suretrust.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.suretrustapp.suretrust.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAboutDeveloperBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatTextView about;

  @NonNull
  public final CircleImageView coverImage;

  @NonNull
  public final AppCompatImageView githubBtn;

  @NonNull
  public final AppCompatImageView gmailBtn;

  @NonNull
  public final AppCompatImageView linkedinBtn;

  @NonNull
  public final AppCompatTextView name;

  private FragmentAboutDeveloperBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatTextView about, @NonNull CircleImageView coverImage,
      @NonNull AppCompatImageView githubBtn, @NonNull AppCompatImageView gmailBtn,
      @NonNull AppCompatImageView linkedinBtn, @NonNull AppCompatTextView name) {
    this.rootView = rootView;
    this.about = about;
    this.coverImage = coverImage;
    this.githubBtn = githubBtn;
    this.gmailBtn = gmailBtn;
    this.linkedinBtn = linkedinBtn;
    this.name = name;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAboutDeveloperBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAboutDeveloperBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_about_developer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAboutDeveloperBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.about;
      AppCompatTextView about = ViewBindings.findChildViewById(rootView, id);
      if (about == null) {
        break missingId;
      }

      id = R.id.cover_image;
      CircleImageView coverImage = ViewBindings.findChildViewById(rootView, id);
      if (coverImage == null) {
        break missingId;
      }

      id = R.id.github_btn;
      AppCompatImageView githubBtn = ViewBindings.findChildViewById(rootView, id);
      if (githubBtn == null) {
        break missingId;
      }

      id = R.id.gmail_btn;
      AppCompatImageView gmailBtn = ViewBindings.findChildViewById(rootView, id);
      if (gmailBtn == null) {
        break missingId;
      }

      id = R.id.linkedin_btn;
      AppCompatImageView linkedinBtn = ViewBindings.findChildViewById(rootView, id);
      if (linkedinBtn == null) {
        break missingId;
      }

      id = R.id.name;
      AppCompatTextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      return new FragmentAboutDeveloperBinding((ConstraintLayout) rootView, about, coverImage,
          githubBtn, gmailBtn, linkedinBtn, name);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
