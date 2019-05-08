
# MeasurementUnit

### Description

Represents a unit of measurement to use with a quantity, such as ounces or inches. Exactly one of the following fields are required: `custom_unit`, `area_unit`, `length_unit`, `volume_unit`, and `weight_unit`.  The `family` field describes the type of measurement. For example, ounces are in the weight family.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customUnit** | [**MeasurementUnitCustom**](MeasurementUnitCustom.md) | A custom unit of measurement defined by the seller using the Point of Sale app or ad-hoc as an order line item. |  [optional]
**areaUnit** | [**AreaUnitEnum**](#AreaUnitEnum) | Represents a standard area unit. See [MeasurementUnitArea](#type-measurementunitarea) for possible values |  [optional]
**lengthUnit** | [**LengthUnitEnum**](#LengthUnitEnum) | Represents a standard length unit. See [MeasurementUnitLength](#type-measurementunitlength) for possible values |  [optional]
**volumeUnit** | [**VolumeUnitEnum**](#VolumeUnitEnum) | Represents a standard volume unit. See [MeasurementUnitVolume](#type-measurementunitvolume) for possible values |  [optional]
**weightUnit** | [**WeightUnitEnum**](#WeightUnitEnum) | Represents a standard unit of weight or mass. See [MeasurementUnitWeight](#type-measurementunitweight) for possible values |  [optional]


<a name="AreaUnitEnum"></a>
## Enum: AreaUnitEnum
Name | Value
---- | -----
IMPERIAL_ACRE | &quot;IMPERIAL_ACRE&quot;
IMPERIAL_SQUARE_INCH | &quot;IMPERIAL_SQUARE_INCH&quot;
IMPERIAL_SQUARE_FOOT | &quot;IMPERIAL_SQUARE_FOOT&quot;
IMPERIAL_SQUARE_YARD | &quot;IMPERIAL_SQUARE_YARD&quot;
IMPERIAL_SQUARE_MILE | &quot;IMPERIAL_SQUARE_MILE&quot;
METRIC_SQUARE_CENTIMETER | &quot;METRIC_SQUARE_CENTIMETER&quot;
METRIC_SQUARE_METER | &quot;METRIC_SQUARE_METER&quot;
METRIC_SQUARE_KILOMETER | &quot;METRIC_SQUARE_KILOMETER&quot;


<a name="LengthUnitEnum"></a>
## Enum: LengthUnitEnum
Name | Value
---- | -----
IMPERIAL_INCH | &quot;IMPERIAL_INCH&quot;
IMPERIAL_FOOT | &quot;IMPERIAL_FOOT&quot;
IMPERIAL_YARD | &quot;IMPERIAL_YARD&quot;
IMPERIAL_MILE | &quot;IMPERIAL_MILE&quot;
METRIC_MILLIMETER | &quot;METRIC_MILLIMETER&quot;
METRIC_CENTIMETER | &quot;METRIC_CENTIMETER&quot;
METRIC_METER | &quot;METRIC_METER&quot;
METRIC_KILOMETER | &quot;METRIC_KILOMETER&quot;


<a name="VolumeUnitEnum"></a>
## Enum: VolumeUnitEnum
Name | Value
---- | -----
GENERIC_FLUID_OUNCE | &quot;GENERIC_FLUID_OUNCE&quot;
GENERIC_SHOT | &quot;GENERIC_SHOT&quot;
GENERIC_CUP | &quot;GENERIC_CUP&quot;
GENERIC_PINT | &quot;GENERIC_PINT&quot;
GENERIC_QUART | &quot;GENERIC_QUART&quot;
GENERIC_GALLON | &quot;GENERIC_GALLON&quot;
IMPERIAL_CUBIC_INCH | &quot;IMPERIAL_CUBIC_INCH&quot;
IMPERIAL_CUBIC_FOOT | &quot;IMPERIAL_CUBIC_FOOT&quot;
IMPERIAL_CUBIC_YARD | &quot;IMPERIAL_CUBIC_YARD&quot;
METRIC_MILLILITER | &quot;METRIC_MILLILITER&quot;
METRIC_LITER | &quot;METRIC_LITER&quot;


<a name="WeightUnitEnum"></a>
## Enum: WeightUnitEnum
Name | Value
---- | -----
IMPERIAL_WEIGHT_OUNCE | &quot;IMPERIAL_WEIGHT_OUNCE&quot;
IMPERIAL_POUND | &quot;IMPERIAL_POUND&quot;
IMPERIAL_STONE | &quot;IMPERIAL_STONE&quot;
METRIC_MILLIGRAM | &quot;METRIC_MILLIGRAM&quot;
METRIC_GRAM | &quot;METRIC_GRAM&quot;
METRIC_KILOGRAM | &quot;METRIC_KILOGRAM&quot;



