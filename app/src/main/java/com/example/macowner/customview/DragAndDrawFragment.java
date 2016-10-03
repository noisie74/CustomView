package com.example.macowner.customview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by macowner on 10/3/16.
 */
public class DragAndDrawFragment extends Fragment {

  public static DragAndDrawFragment newInstance() {
    return new DragAndDrawFragment();
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View v = inflater.inflate(R.layout.frgament_drag_and_draw, container, false);
    return v;
  }
}

