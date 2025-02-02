﻿//
// BIM IFC library: this library works with Autodesk(R) Revit(R) to export IFC files containing model geometry.
// Copyright (C) 2012  Autodesk, Inc.
// 
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
//

using System;
using System.Collections.Generic;
using System.Text;
using Autodesk.Revit;
using Autodesk.Revit.DB;
using Autodesk.Revit.DB.IFC;
using BIM.IFC.Utility;
using BIM.IFC.Toolkit;


namespace BIM.IFC.Exporter
{
    /// <summary>
    ///  An class representing data about a given family element type.
    /// </summary>
    class FamilyTypeInfo
    {
        /// <summary>
        ///  Identifies if the object represents a valid type info.
        ///  A type info must have either the style, 3d map handle, or 2d map handle set
        /// to a valid value to be valid.
        /// </summary>
        /// <returns>
        /// True if the object is valid, false otherwise. 
        /// </returns>
        public bool IsValid()
        {
            return !IFCAnyHandleUtil.IsNullOrHasNoValue(Style) || 
                !IFCAnyHandleUtil.IsNullOrHasNoValue(Map2DHandle) ||
                !IFCAnyHandleUtil.IsNullOrHasNoValue(Map3DHandle);
        }

        /// <summary>
        /// The associated handle to an IfcTypeProduct for the type.
        /// </summary>
        IFCAnyHandle m_Style = null;

        /// <summary>
        /// The associated handle to a 2D IfcRepresentationMap for the type.
        /// </summary>
        IFCAnyHandle m_Map2DHandle = null;

        /// <summary>
        /// The associated handle to a 3D IfcRepresentationMap for the type.
        /// </summary>
        IFCAnyHandle m_Map3DHandle = null;

        /// <summary>
        /// The material id associated with this type.
        /// </summary>
        HashSet<ElementId> m_MaterialIds = null;

        /// <summary>  
        /// The transform between the coordinate system of the type and the coordinate system of the 
        /// instance's location in the Revit model.
        /// </summary>
        Transform m_StyleTransform = null;

        /// <summary>
        /// The area of the type's cross-section, scaled into the units of export.
        /// This property is typically used only for columns, beams and other framing members.
        /// </summary>
        double m_ScaledArea = 0.0;

        /// <summary>
        /// The depth of the type, scaled into the units of export.
        /// This property is typically used only for columns, beams and other framing members.
        /// </summary>
        double m_ScaledDepth = 0.0;

        /// <summary>
        /// The inner perimeter of the boundaries of the type's cross-section, scaled into the units of export.
        /// This property is typically used only for columns, beams and other framing members.
        /// </summary>
        double m_ScaledInnerPerimeter = 0.0;

        /// <summary>
        /// The outer perimeter of the boundaries of the type's cross-section, scaled into the units of export.
        /// This property is typically used only for columns, beams and other framing members.
        /// </summary>
        double m_ScaledOuterPerimeter = 0.0;

        /// <summary>
        /// The associated handle to an IfcTypeProduct for the type.
        /// </summary>
        public IFCAnyHandle Style
        {
            get { return m_Style; }
            set { m_Style = value; }
        }

        /// <summary>
        /// The associated handle to a 2D IfcRepresentationMap for the type.
        /// Typically used only for Building Element Proxy elements (masses).
        /// </summary>
        public IFCAnyHandle Map2DHandle
        {
            get { return m_Map2DHandle; }
            set { m_Map2DHandle = value; }
        }

        /// <summary>
        /// The associated handle to a 3D IfcRepresentationMap for the type.
        /// Typically used only for Building Element Proxy elements (masses).
        /// </summary>
        public IFCAnyHandle Map3DHandle
        {
            get { return m_Map3DHandle; }
            set { m_Map3DHandle = value; }
        }

        /// <summary>
        /// The material ids associated with this type.
        /// </summary>
        public HashSet<ElementId> MaterialIds
        {
            get
            {
                if (m_MaterialIds == null)
                    m_MaterialIds = new HashSet<ElementId>();
                return m_MaterialIds;
            }
            set { m_MaterialIds = value; }
        }

        /// <summary>  
        /// The transform between the coordinate system of the type and the coordinate system of the 
        /// instance's location in the Revit model.
        /// </summary>
        public Transform StyleTransform
        {
            get 
            {
                if (m_StyleTransform == null)
                    m_StyleTransform = Transform.Identity;
                return m_StyleTransform; 
            }
            set { m_StyleTransform = value; }
        }

        /// <summary>
        /// The area of the type's cross-section, scaled into the units of export.
        /// This property is typically used only for columns, beams and other framing members.
        /// </summary>
        public double ScaledArea
        {
            get { return m_ScaledArea; }
            set { m_ScaledArea = value; }
        }

        /// <summary>
        /// The depth of the type, scaled into the units of export.
        /// This property is typically used only for columns, beams and other framing members.
        /// </summary>
        public double ScaledDepth
        {
            get { return m_ScaledDepth; }
            set { m_ScaledDepth = value; }
        }

        /// <summary>
        /// The inner perimeter of the boundaries of the type's cross-section, scaled into the units of export.
        /// This property is typically used only for columns, beams and other framing members.
        /// </summary>
        public double ScaledInnerPerimeter
        {
            get { return m_ScaledInnerPerimeter; }
            set { m_ScaledInnerPerimeter = value; }
        }

        /// <summary>
        /// The outer perimeter of the boundaries of the type's cross-section, scaled into the units of export.
        /// This property is typically used only for columns, beams and other framing members.
        /// </summary>
        public double ScaledOuterPerimeter
        {
            get { return m_ScaledOuterPerimeter; }
            set { m_ScaledOuterPerimeter = value; }
        }
    }
}
