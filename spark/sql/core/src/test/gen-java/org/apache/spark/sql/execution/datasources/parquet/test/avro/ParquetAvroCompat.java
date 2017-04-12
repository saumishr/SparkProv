/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.spark.sql.execution.datasources.parquet.test.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ParquetAvroCompat extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ParquetAvroCompat\",\"namespace\":\"org.apache.spark.sql.execution.datasources.parquet.test.avro\",\"fields\":[{\"name\":\"strings_column\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"string_to_int_column\",\"type\":{\"type\":\"map\",\"values\":\"int\",\"avro.java.string\":\"String\"}},{\"name\":\"complex_column\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Nested\",\"fields\":[{\"name\":\"nested_ints_column\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"nested_string_column\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}},\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<java.lang.String> strings_column;
  @Deprecated public java.util.Map<java.lang.String,java.lang.Integer> string_to_int_column;
  @Deprecated public java.util.Map<java.lang.String,java.util.List<org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested>> complex_column;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public ParquetAvroCompat() {}

  /**
   * All-args constructor.
   */
  public ParquetAvroCompat(java.util.List<java.lang.String> strings_column, java.util.Map<java.lang.String,java.lang.Integer> string_to_int_column, java.util.Map<java.lang.String,java.util.List<org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested>> complex_column) {
    this.strings_column = strings_column;
    this.string_to_int_column = string_to_int_column;
    this.complex_column = complex_column;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return strings_column;
    case 1: return string_to_int_column;
    case 2: return complex_column;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: strings_column = (java.util.List<java.lang.String>)value$; break;
    case 1: string_to_int_column = (java.util.Map<java.lang.String,java.lang.Integer>)value$; break;
    case 2: complex_column = (java.util.Map<java.lang.String,java.util.List<org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested>>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'strings_column' field.
   */
  public java.util.List<java.lang.String> getStringsColumn() {
    return strings_column;
  }

  /**
   * Sets the value of the 'strings_column' field.
   * @param value the value to set.
   */
  public void setStringsColumn(java.util.List<java.lang.String> value) {
    this.strings_column = value;
  }

  /**
   * Gets the value of the 'string_to_int_column' field.
   */
  public java.util.Map<java.lang.String,java.lang.Integer> getStringToIntColumn() {
    return string_to_int_column;
  }

  /**
   * Sets the value of the 'string_to_int_column' field.
   * @param value the value to set.
   */
  public void setStringToIntColumn(java.util.Map<java.lang.String,java.lang.Integer> value) {
    this.string_to_int_column = value;
  }

  /**
   * Gets the value of the 'complex_column' field.
   */
  public java.util.Map<java.lang.String,java.util.List<org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested>> getComplexColumn() {
    return complex_column;
  }

  /**
   * Sets the value of the 'complex_column' field.
   * @param value the value to set.
   */
  public void setComplexColumn(java.util.Map<java.lang.String,java.util.List<org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested>> value) {
    this.complex_column = value;
  }

  /** Creates a new ParquetAvroCompat RecordBuilder */
  public static org.apache.spark.sql.execution.datasources.parquet.test.avro.ParquetAvroCompat.Builder newBuilder() {
    return new org.apache.spark.sql.execution.datasources.parquet.test.avro.ParquetAvroCompat.Builder();
  }
  
  /** Creates a new ParquetAvroCompat RecordBuilder by copying an existing Builder */
  public static org.apache.spark.sql.execution.datasources.parquet.test.avro.ParquetAvroCompat.Builder newBuilder(org.apache.spark.sql.execution.datasources.parquet.test.avro.ParquetAvroCompat.Builder other) {
    return new org.apache.spark.sql.execution.datasources.parquet.test.avro.ParquetAvroCompat.Builder(other);
  }
  
  /** Creates a new ParquetAvroCompat RecordBuilder by copying an existing ParquetAvroCompat instance */
  public static org.apache.spark.sql.execution.datasources.parquet.test.avro.ParquetAvroCompat.Builder newBuilder(org.apache.spark.sql.execution.datasources.parquet.test.avro.ParquetAvroCompat other) {
    return new org.apache.spark.sql.execution.datasources.parquet.test.avro.ParquetAvroCompat.Builder(other);
  }
  
  /**
   * RecordBuilder for ParquetAvroCompat instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ParquetAvroCompat>
    implements org.apache.avro.data.RecordBuilder<ParquetAvroCompat> {

    private java.util.List<java.lang.String> strings_column;
    private java.util.Map<java.lang.String,java.lang.Integer> string_to_int_column;
    private java.util.Map<java.lang.String,java.util.List<org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested>> complex_column;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.spark.sql.execution.datasources.parquet.test.avro.ParquetAvroCompat.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.spark.sql.execution.datasources.parquet.test.avro.ParquetAvroCompat.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.strings_column)) {
        this.strings_column = data().deepCopy(fields()[0].schema(), other.strings_column);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.string_to_int_column)) {
        this.string_to_int_column = data().deepCopy(fields()[1].schema(), other.string_to_int_column);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.complex_column)) {
        this.complex_column = data().deepCopy(fields()[2].schema(), other.complex_column);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing ParquetAvroCompat instance */
    private Builder(org.apache.spark.sql.execution.datasources.parquet.test.avro.ParquetAvroCompat other) {
            super(org.apache.spark.sql.execution.datasources.parquet.test.avro.ParquetAvroCompat.SCHEMA$);
      if (isValidValue(fields()[0], other.strings_column)) {
        this.strings_column = data().deepCopy(fields()[0].schema(), other.strings_column);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.string_to_int_column)) {
        this.string_to_int_column = data().deepCopy(fields()[1].schema(), other.string_to_int_column);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.complex_column)) {
        this.complex_column = data().deepCopy(fields()[2].schema(), other.complex_column);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'strings_column' field */
    public java.util.List<java.lang.String> getStringsColumn() {
      return strings_column;
    }
    
    /** Sets the value of the 'strings_column' field */
    public org.apache.spark.sql.execution.datasources.parquet.test.avro.ParquetAvroCompat.Builder setStringsColumn(java.util.List<java.lang.String> value) {
      validate(fields()[0], value);
      this.strings_column = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'strings_column' field has been set */
    public boolean hasStringsColumn() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'strings_column' field */
    public org.apache.spark.sql.execution.datasources.parquet.test.avro.ParquetAvroCompat.Builder clearStringsColumn() {
      strings_column = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'string_to_int_column' field */
    public java.util.Map<java.lang.String,java.lang.Integer> getStringToIntColumn() {
      return string_to_int_column;
    }
    
    /** Sets the value of the 'string_to_int_column' field */
    public org.apache.spark.sql.execution.datasources.parquet.test.avro.ParquetAvroCompat.Builder setStringToIntColumn(java.util.Map<java.lang.String,java.lang.Integer> value) {
      validate(fields()[1], value);
      this.string_to_int_column = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'string_to_int_column' field has been set */
    public boolean hasStringToIntColumn() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'string_to_int_column' field */
    public org.apache.spark.sql.execution.datasources.parquet.test.avro.ParquetAvroCompat.Builder clearStringToIntColumn() {
      string_to_int_column = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'complex_column' field */
    public java.util.Map<java.lang.String,java.util.List<org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested>> getComplexColumn() {
      return complex_column;
    }
    
    /** Sets the value of the 'complex_column' field */
    public org.apache.spark.sql.execution.datasources.parquet.test.avro.ParquetAvroCompat.Builder setComplexColumn(java.util.Map<java.lang.String,java.util.List<org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested>> value) {
      validate(fields()[2], value);
      this.complex_column = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'complex_column' field has been set */
    public boolean hasComplexColumn() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'complex_column' field */
    public org.apache.spark.sql.execution.datasources.parquet.test.avro.ParquetAvroCompat.Builder clearComplexColumn() {
      complex_column = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings(value="unchecked")
    public ParquetAvroCompat build() {
      try {
        ParquetAvroCompat record = new ParquetAvroCompat();
        record.strings_column = fieldSetFlags()[0] ? this.strings_column : (java.util.List<java.lang.String>) defaultValue(fields()[0]);
        record.string_to_int_column = fieldSetFlags()[1] ? this.string_to_int_column : (java.util.Map<java.lang.String,java.lang.Integer>) defaultValue(fields()[1]);
        record.complex_column = fieldSetFlags()[2] ? this.complex_column : (java.util.Map<java.lang.String,java.util.List<org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested>>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
