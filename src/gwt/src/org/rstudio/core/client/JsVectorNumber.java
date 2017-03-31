/*
 * JsVectorNumber.java
 *
 * Copyright (C) 2009-17 by RStudio, Inc.
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */
package org.rstudio.core.client;

import com.google.gwt.core.client.JavaScriptObject;

public class JsVectorNumber extends JavaScriptObject
{
   protected JsVectorNumber()
   {
   }
   
   public static final native JsVectorNumber createVector()
   /*-{
      return [];
   }-*/;
   
   public static final native JsVectorNumber concat(JsVectorNumber lhs, JsVectorNumber rhs)
   /*-{
      return lhs.concat(rhs);
   }-*/;
   
   public static final native JsVectorNumber ofLength(int n)
   /*-{
      var result = [];
      result.length = n;
      return result;
   }-*/;
   
   public final native JsVectorNumber concat(JsVectorNumber other)
   /*-{
      return [].concat.apply(this, other);
   }-*/;
   
   public final native void fill(double value, int start, int end)
   /*-{
      this.fill(value, start, end);
   }-*/;
   
   public final void fill(double value)
   {
      fill(value, 0, length());
   }
   
   public final native double get(int index)
   /*-{
      return this[index];
   }-*/;
   
   public final native int indexOf(double value)
   /*-{
      return this.indexOf(value);
   }-*/;
   
   public final native void insert(int index, JsVectorNumber values)
   /*-{
      [].splice.apply(this, [index, 0].concat(values));
   }-*/;
   
   public final native void insert(int index, double value)
   /*-{
      this.splice(index, 0, value);
   }-*/;
   
   public final native String join(String delimiter)
   /*-{
      return this.join(delimiter);
   }-*/;
   
   public final String join()
   {
      return join(",");
   }
   
   public final native int length()
   /*-{
      return this.length || 0;
   }-*/;
   
   public final native void push(double object)
   /*-{
      this.push(object);
   }-*/;
   
   public final native void push(JsVectorNumber object)
   /*-{
      [].push.apply(this, object);
   }-*/;
   
   public final native double pop()
   /*-{
      return this.pop();
   }-*/;
   
   public final native void remove(int index, int count)
   /*-{
      return this.splice(index, count);
   }-*/;
   
   public final void remove(int index)
   {
      remove(index, 1);
   }
   
   public final native void reverse()
   /*-{
      this.reverse();
   }-*/;
   
   public final native double shift()
   /*-{
      return this.shift();
   }-*/;
   
   public final native void splice(int start, int end, JsVectorNumber vector)
   /*-{
      this.splice(start, end, vector);
   }-*/;
   
   public final native void set(int index, double value)
   /*-{
      this[index] = value;
   }-*/;
   
   public final native int unshift(double object)
   /*-{
      return this.unshift(object);
   }-*/;
   
   public final native int unshift(JsVectorNumber vector)
   /*-{
      return [].unshift.apply(this, vector);
   }-*/;

}
