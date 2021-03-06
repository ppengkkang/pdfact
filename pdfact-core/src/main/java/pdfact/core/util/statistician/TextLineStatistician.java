package pdfact.core.util.statistician;

import java.util.List;

import pdfact.core.model.HasTextLineStatistic;
import pdfact.core.model.HasTextLines;
import pdfact.core.model.TextLine;
import pdfact.core.model.TextLineStatistic;
import pdfact.core.util.list.ElementList;

/**
 * A class that computes statistics about text line.
 * 
 * @author Claudius Korzen
 */
public interface TextLineStatistician {
  /**
   * Computes the text line statistic for the given text lines.
   * 
   * @param hasTextLines
   *        An element that has text lines.
   * 
   * @return The computed text line statistics.
   */
  TextLineStatistic compute(HasTextLines hasTextLines);

  /**
   * Computes the text line statistic for the given text lines.
   * 
   * @param textLines
   *        The text lines to process.
   * 
   * @return The computed text line statistics.
   */
  TextLineStatistic compute(ElementList<TextLine> textLines);

  /**
   * Combines the given list of text line statistics to a single statistic.
   * 
   * @param stats
   *        The statistics to combine.
   * 
   * @return The combined statistics.
   */
  TextLineStatistic aggregate(List<? extends HasTextLineStatistic> stats);
}