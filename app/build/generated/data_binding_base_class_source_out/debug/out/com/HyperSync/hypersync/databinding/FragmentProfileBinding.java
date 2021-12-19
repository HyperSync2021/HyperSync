// Generated by view binder compiler. Do not edit!
package com.HyperSync.hypersync.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.HyperSync.hypersync.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView adminTool;

  @NonNull
  public final TextView profileContactNumber;

  @NonNull
  public final TextView profileDesignation;

  @NonNull
  public final TextView profileEmail;

  @NonNull
  public final TextView profileOrganization;

  @NonNull
  public final TextView textView10;

  private FragmentProfileBinding(@NonNull LinearLayout rootView, @NonNull TextView adminTool,
      @NonNull TextView profileContactNumber, @NonNull TextView profileDesignation,
      @NonNull TextView profileEmail, @NonNull TextView profileOrganization,
      @NonNull TextView textView10) {
    this.rootView = rootView;
    this.adminTool = adminTool;
    this.profileContactNumber = profileContactNumber;
    this.profileDesignation = profileDesignation;
    this.profileEmail = profileEmail;
    this.profileOrganization = profileOrganization;
    this.textView10 = textView10;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.admin_tool;
      TextView adminTool = ViewBindings.findChildViewById(rootView, id);
      if (adminTool == null) {
        break missingId;
      }

      id = R.id.profile_contactNumber;
      TextView profileContactNumber = ViewBindings.findChildViewById(rootView, id);
      if (profileContactNumber == null) {
        break missingId;
      }

      id = R.id.profile_designation;
      TextView profileDesignation = ViewBindings.findChildViewById(rootView, id);
      if (profileDesignation == null) {
        break missingId;
      }

      id = R.id.profile_email;
      TextView profileEmail = ViewBindings.findChildViewById(rootView, id);
      if (profileEmail == null) {
        break missingId;
      }

      id = R.id.profile_organization;
      TextView profileOrganization = ViewBindings.findChildViewById(rootView, id);
      if (profileOrganization == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      return new FragmentProfileBinding((LinearLayout) rootView, adminTool, profileContactNumber,
          profileDesignation, profileEmail, profileOrganization, textView10);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}