package com.example.macowner.customview;

import android.graphics.PointF;

/**
 * Created by macowner on 10/3/16.
 */
public class Box {

  private PointF mOrigin;
  private PointF mCurrent;

  public Box(PointF origin) {
    mOrigin = origin;
    mCurrent = origin;
  }

  public PointF getmOrigin() {
    return mOrigin;
  }

  public void setmOrigin(PointF mOrigin) {
    this.mOrigin = mOrigin;
  }

  public PointF getmCurrent() {
    return mCurrent;
  }

  public void setmCurrent(PointF mCurrent) {
    this.mCurrent = mCurrent;
  }
}
