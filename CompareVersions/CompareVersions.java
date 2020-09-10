package CompareVersions;

class CompareVersion {
    public static void main(String[] args) {
        String ver1 = "1.0", ver2= "1.0.0";
        CompareVersion cv = new CompareVersion();
        int res = cv.compareVersions(ver1, ver2);
        System.out.println(res);
    }
    public int compareVersions(String version1, String version2) {
        int res = 0;
        String[] arr1, arr2;
        arr1 = version1.split("\\.");
        arr2 = version2.split("\\.");
        int total_length = arr1.length > arr2.length ? arr1.length : arr2.length;
        int num1 = 0, num2 = 0;
        for (int i = 0 ; i < total_length; i++)
        {
            num1 = i >= arr1.length ? 0 : Integer.parseInt(arr1[i]);
            num2 = i >= arr2.length ? 0 : Integer.parseInt(arr2[i]);
            if (num1 > num2)
            {
                res = 1;
                break;
            }
            else if (num1 < num2)
            {
                res = -1;
                break;
            }
        }
        return res;
    }
}