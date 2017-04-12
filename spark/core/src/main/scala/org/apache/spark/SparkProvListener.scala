/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.spark

import org.apache.spark.internal.Logging
import org.apache.spark.scheduler.{
  SparkListener,
  SparkListenerJobStart,
  SparkListenerStageCompleted,
  SparkListenerStageSubmitted
}

class SparkProvListener extends SparkListener with Logging {
  override def onJobStart(jobStart: SparkListenerJobStart) {
    logInfo(s"Provenance: Job started with ${jobStart.stageInfos.size} stages: $jobStart")
  }

  override def onStageSubmitted(stageSubmitted: SparkListenerStageSubmitted): Unit = {
    logInfo(s"Provenance: Stage ${stageSubmitted.stageInfo.stageId}" +
      s"submitted with ${stageSubmitted.stageInfo.numTasks} tasks.")
  }

  override def onStageCompleted(stageCompleted: SparkListenerStageCompleted): Unit = {
    logInfo(s"Provenance: Stage ${stageCompleted.stageInfo.stageId}" +
      s"completed with ${stageCompleted.stageInfo.numTasks} tasks.")
  }
}
