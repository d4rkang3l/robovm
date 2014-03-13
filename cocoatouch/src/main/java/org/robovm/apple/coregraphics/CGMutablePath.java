/*
 * Copyright (C) 2014 Trillian AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.coregraphics;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.foundation.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("CoreGraphics")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGMutablePath/*</name>*/ 
    extends /*<extends>*/CGPath/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CGMutablePathPtr extends Ptr<CGMutablePath, CGMutablePathPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CGMutablePath.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CGMutablePath() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    
    public void addRects(CGAffineTransform m, CGRect[] rects) {
        if (rects == null) {
            throw new NullPointerException("rects");
        }
        CGRect first = Struct.allocate(CGRect.class, rects.length);
        first.update(rects);
        addRects(m, first, rects.length);
    }
    
    public void addLines(CGAffineTransform m, CGPoint[] points) {
        if (points == null) {
            throw new NullPointerException("points");
        }
        CGPoint first = Struct.allocate(CGPoint.class, points.length);
        first.update(points);
        addLines(m, first, points.length);
    }
    
    /*<methods>*/
    @Bridge(symbol="CGPathCreateMutable")
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGMutablePath createMutable();
    @Bridge(symbol="CGPathCreateMutableCopy")
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGMutablePath createMutableCopy(CGPath path);
    @Bridge(symbol="CGPathCreateMutableCopyByTransformingPath")
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGMutablePath createMutableCopyByTransformingPath(CGPath path, CGAffineTransform transform);
    @Bridge(symbol="CGPathAddRoundedRect")
    public native void addRoundedRect(CGAffineTransform transform, @ByVal CGRect rect, @MachineSizedFloat double cornerWidth, @MachineSizedFloat double cornerHeight);
    @Bridge(symbol="CGPathMoveToPoint")
    public native void moveToPoint(CGAffineTransform m, @MachineSizedFloat double x, @MachineSizedFloat double y);
    @Bridge(symbol="CGPathAddLineToPoint")
    public native void addLineToPoint(CGAffineTransform m, @MachineSizedFloat double x, @MachineSizedFloat double y);
    @Bridge(symbol="CGPathAddQuadCurveToPoint")
    public native void addQuadCurveToPoint(CGAffineTransform m, @MachineSizedFloat double cpx, @MachineSizedFloat double cpy, @MachineSizedFloat double x, @MachineSizedFloat double y);
    @Bridge(symbol="CGPathAddCurveToPoint")
    public native void addCurveToPoint(CGAffineTransform m, @MachineSizedFloat double cp1x, @MachineSizedFloat double cp1y, @MachineSizedFloat double cp2x, @MachineSizedFloat double cp2y, @MachineSizedFloat double x, @MachineSizedFloat double y);
    @Bridge(symbol="CGPathCloseSubpath")
    public native void closeSubpath();
    @Bridge(symbol="CGPathAddRect")
    public native void addRect(CGAffineTransform m, @ByVal CGRect rect);
    @Bridge(symbol="CGPathAddRects")
    protected native void addRects(CGAffineTransform m, CGRect rects, @MachineSizedUInt long count);
    @Bridge(symbol="CGPathAddLines")
    protected native void addLines(CGAffineTransform m, CGPoint points, @MachineSizedUInt long count);
    @Bridge(symbol="CGPathAddEllipseInRect")
    public native void addEllipseInRect(CGAffineTransform m, @ByVal CGRect rect);
    @Bridge(symbol="CGPathAddRelativeArc")
    public native void addRelativeArc(CGAffineTransform matrix, @MachineSizedFloat double x, @MachineSizedFloat double y, @MachineSizedFloat double radius, @MachineSizedFloat double startAngle, @MachineSizedFloat double delta);
    @Bridge(symbol="CGPathAddArc")
    public native void addArc(CGAffineTransform m, @MachineSizedFloat double x, @MachineSizedFloat double y, @MachineSizedFloat double radius, @MachineSizedFloat double startAngle, @MachineSizedFloat double endAngle, boolean clockwise);
    @Bridge(symbol="CGPathAddArcToPoint")
    public native void addArcToPoint(CGAffineTransform m, @MachineSizedFloat double x1, @MachineSizedFloat double y1, @MachineSizedFloat double x2, @MachineSizedFloat double y2, @MachineSizedFloat double radius);
    @Bridge(symbol="CGPathAddPath")
    public native void addPath(CGAffineTransform m, CGPath path2);
    /*</methods>*/
}
