/*
 *
 *  *
 *  *  * Copyright 2015 Skymind,Inc.
 *  *  *
 *  *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *  *    you may not use this file except in compliance with the License.
 *  *  *    You may obtain a copy of the License at
 *  *  *
 *  *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *  *
 *  *  *    Unless required by applicable law or agreed to in writing, software
 *  *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  *    See the License for the specific language governing permissions and
 *  *  *    limitations under the License.
 *  *
 *
 */

package org.nd4j.etl4j.api.formats.output.impl;

import org.nd4j.etl4j.api.conf.Configuration;
import org.nd4j.etl4j.api.exceptions.CanovaException;
import org.nd4j.etl4j.api.formats.output.OutputFormat;
import org.nd4j.etl4j.api.records.writer.RecordWriter;
import org.nd4j.etl4j.api.records.writer.impl.LibSvmRecordWriter;

/**
 * @author Adam Gibson
 */
public class LibSvmOutputFormat implements OutputFormat {
    @Override
    public RecordWriter createWriter(Configuration conf) throws CanovaException {
        RecordWriter writer = new LibSvmRecordWriter();
        writer.setConf(conf);
        return writer;
    }
}