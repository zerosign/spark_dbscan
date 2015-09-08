package org.alitouka.spark.dbscan.spatial

import scala.collection.mutable.ListBuffer

private [dbscan] class BoxTreeItemWithPoints (b: Box,
  val points: ListBuffer[Point] = new ListBuffer[Point] (),
  val adjacentBoxes: ListBuffer[BoxTreeItemWithPoints] = new ListBuffer[BoxTreeItemWithPoints] ())
  extends BoxTreeItemBase [BoxTreeItemWithPoints] (b) {
}
