// źródło github

package latweA.Strona1.A50_JLITOSL_przekroczenieCzasu;

public class Main3_Csharp {

    /*
    using System;
using System.Collections.Generic;

namespace JLITOSL
{
	class Program
	{
		static void Main(string[] args)
		{
			Dictionary<char, string> cyfry = new Dictionary<char, string>()
			{
				{'0', " " },
				{'1', "jeden " },
				{'2', "dwa " },
				{'3', "trzy " },
				{'4', "cztery " },
				{'5', "piec " },
				{'6', "szesc " },
				{'7', "siedem " },
				{'8', "osiem " },
				{'9', "dziewiec " },
			};
			Dictionary<char, string> dziesiatki = new Dictionary<char, string>()
			{
				{'0', "" },
				{'1', "dziesiec " },
				{'2', "dwadziescia " },
				{'3', "trzydziesci " },
				{'4', "czterdziesci " },
				{'5', "piecdziesiat " },
				{'6', "szescdziesiat " },
				{'7', "siedemdziesiat " },
				{'8', "osiemdziesiat " },
				{'9', "dziewiecdziesiat " },
			};
			Dictionary<char, string> tentwo = new Dictionary<char, string>()
			{
				{'0', "dziesiec" },
				{'1', "jedenascie " },
				{'2', "dwanascie " },
				{'3', "trzynascie " },
				{'4', "czternascie " },
				{'5', "pietnascie " },
				{'6', "szesnascie " },
				{'7', "siedemnascie " },
				{'8', "osiemnascie " },
				{'9', "dziewietnascie " },
			};
			Dictionary<char, string> setki = new Dictionary<char, string>()
			{
				{'0', " " },
				{'1', "sto " },
				{'2', "dwiescie " },
				{'3', "trzysta " },
				{'4', "czterysta " },
				{'5', "piecset " },
				{'6', "szescset " },
				{'7', "siedemset " },
				{'8', "osiemset " },
				{'9', "dziewiecset " },
			};

			Dictionary<int, string> nnn = new Dictionary<int, string>()
			{
				{0, " " },
				{1, " tys. " },
				{2, " mln. " },
				{3, " mld. " },
				{4, " bln. " }
			};
			int t = Convert.ToInt32(Console.ReadLine());
			for (int i = 0; i < t; i++)
			{
				string slownie = "";
				string liczba = Console.ReadLine();
				for (int j = liczba.Length-1; j >=0  ; j--)
				{
					int n = 0;
					if (liczba.Length > 3 && j <= liczba.Length - 4 && ((j%3 +1 == 3? 0 : j % 3 + 1) == liczba.Length%3))
					{
						n = liczba.Length/3 - j/3;
						if (j>2 && j - 1 >= 0 && liczba[j - 1] == '0')
						{
							if (j - 2 >= 0)
							{
								if(liczba[j - 1] == '0')
									continue;
							}
							else
							{
								continue;
							}
						}
						slownie = nnn[n- (liczba.Length%3 == 0 ? 1 : 0 )] + slownie;
					}
					if((liczba.Length - j) % 3 == 1 && j -1 >= 0)
						if (liczba[j - 1] == '1')
						{
							slownie = tentwo[liczba[j]] + slownie;
							j--;
							continue;;
						}
					switch ((liczba.Length - j)%3)
					{
						case 0:
							slownie = setki[liczba[j]] + slownie;
							break;
						case 2:
							slownie = dziesiatki[liczba[j]] + slownie;
							break;
						case 1:
							slownie = cyfry[liczba[j]] + slownie;
							break;
					}
				}
				Console.WriteLine(slownie.Replace("   ", " ").Replace("  ", " ").TrimEnd(' '));
			}
		}
	}
}
*/
}