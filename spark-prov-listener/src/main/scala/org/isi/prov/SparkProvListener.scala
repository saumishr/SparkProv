package org.isi.prov

import org.apache.spark.scheduler._

class SparkProvListener extends SparkListener  {
  override def onJobStart(jobStart: SparkListenerJobStart) {
    println(s"Provenance: Job ${jobStart.jobId} started with ${jobStart.stageInfos.size} stages: $jobStart")
  }

  override def onJobEnd(jobEnd: SparkListenerJobEnd) {
    println(s"Provenance: Job ${jobEnd.jobId} ends: $jobEnd")
  }

  override def onTaskStart(taskStart: SparkListenerTaskStart): Unit = {
    println(s"Provenance: Task ${taskStart.taskInfo.taskId}" +
      s" started in stage ${taskStart.stageId}.")
  }

  override def onTaskEnd(taskEnd: SparkListenerTaskEnd): Unit = {
    println(s"Provenance: Task ${taskEnd.taskInfo.taskId}" +
      s" Finished in stage ${taskEnd.stageId}.")
  }

  override def onStageSubmitted(stageSubmitted: SparkListenerStageSubmitted): Unit = {
    println(s"Provenance: Stage ${stageSubmitted.stageInfo.stageId}" +
      s" submitted with ${stageSubmitted.stageInfo.numTasks} tasks.")
  }

  override def onStageCompleted(stageCompleted: SparkListenerStageCompleted): Unit = {
    println(s"Provenance: Stage ${stageCompleted.stageInfo.stageId}" +
      s" completed with ${stageCompleted.stageInfo.numTasks} tasks.")
  }
}