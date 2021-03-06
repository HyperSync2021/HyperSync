// Generated by view binder compiler. Do not edit!
package com.HyperSync.hypersync.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.HyperSync.hypersync.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final RecyclerView list;

  @NonNull
  public final LinearLayout llAnnouncement;

  @NonNull
  public final LinearLayout llDeclaration;

  @NonNull
  public final LinearLayout llPoll;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView textView9;

  @NonNull
  public final View view;

  private FragmentHomeBinding(@NonNull LinearLayout rootView, @NonNull ImageView imageView3,
      @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull RecyclerView list,
      @NonNull LinearLayout llAnnouncement, @NonNull LinearLayout llDeclaration,
      @NonNull LinearLayout llPoll, @NonNull TextView textView5, @NonNull TextView textView8,
      @NonNull TextView textView9, @NonNull View view) {
    this.rootView = rootView;
    this.imageView3 = imageView3;
    this.imageView4 = imageView4;
    this.imageView5 = imageView5;
    this.list = list;
    this.llAnnouncement = llAnnouncement;
    this.llDeclaration = llDeclaration;
    this.llPoll = llPoll;
    this.textView5 = textView5;
    this.textView8 = textView8;
    this.textView9 = textView9;
    this.view = view;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.list;
      RecyclerView list = ViewBindings.findChildViewById(rootView, id);
      if (list == null) {
        break missingId;
      }

      id = R.id.llAnnouncement;
      LinearLayout llAnnouncement = ViewBindings.findChildViewById(rootView, id);
      if (llAnnouncement == null) {
        break missingId;
      }

      id = R.id.llDeclaration;
      LinearLayout llDeclaration = ViewBindings.findChildViewById(rootView, id);
      if (llDeclaration == null) {
        break missingId;
      }

      id = R.id.llPoll;
      LinearLayout llPoll = ViewBindings.findChildViewById(rootView, id);
      if (llPoll == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = ViewBindings.findChildViewById(rootView, id);
      if (textView9 == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      return new FragmentHomeBinding((LinearLayout) rootView, imageView3, imageView4, imageView5,
          list, llAnnouncement, llDeclaration, llPoll, textView5, textView8, textView9, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
