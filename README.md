@author Samavia Sophia Saleem
# nahw_and_sarf_in_arabic
# end result for this program should be a visual understanding of the arabic grammar
# dette er under udvikling // this is under development
# for running this code you need to 

* Build in prod mode: ng build --configuration production --output-path ../docs --base-href /
* cd ../docs


These steps are needed if you want to test locally
* XXrm -fRr /usr/share/nginx/html/
* cp -vR . /usr/share/nginx/html

These steps are needed to correct parsing and reading of the arabic alph

* pip install pyarabic
* import pyarabic.araby as araby
* import pyarabic.number as number
* pip install --upgrade arabic-reshaper
* import arabic_reshaper

* pip install python-bidi
from bidi.algorithm import get_display

I used this guide: https://pypi.org/project/PyArabic/

#NOTE this is not published if needed we will publish it on GitHub pages
